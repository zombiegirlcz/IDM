package wim;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f297949a;

    public w(r typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f297949a = typeParameter;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof TypeVariable) || !Intrinsics.f(this.f297949a.getName(), ((TypeVariable) obj2).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f297949a.getUpperBounds();
        ArrayList arrayList = new ArrayList(zhm.w.t(upperBounds, 10));
        Iterator it8 = upperBounds.iterator();
        while (it8.hasNext()) {
            arrayList.add(z.b((KType) it8.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(j6.a.q("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f297949a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f297949a.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f297949a.getName();
    }

    public final int hashCode() {
        this.f297949a.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f297949a.getName();
    }
}
