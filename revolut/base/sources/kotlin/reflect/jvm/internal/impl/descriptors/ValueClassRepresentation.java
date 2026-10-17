package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract boolean containsPropertyWithName(@NotNull Name name);

    @NotNull
    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(@NotNull Function1<? super Type, ? extends Other> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), (RigidTypeMarker) transform.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<Name, Type>> underlyingPropertyNamesToTypes = ((MultiFieldValueClassRepresentation) this).getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(w.t(underlyingPropertyNamesToTypes, 10));
        Iterator<T> it8 = underlyingPropertyNamesToTypes.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            arrayList.add(new Pair((Name) pair.f186385a, transform.invoke((RigidTypeMarker) pair.f186386b)));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
