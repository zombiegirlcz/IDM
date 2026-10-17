package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class ValueClassUtilKt {
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r4, boolean z, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, @NotNull Function1<? super Name, ? extends T> typeOfPublicProperty) {
        RigidTypeMarker rigidTypeMarker;
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r4.hasInlineClassUnderlyingPropertyName()) {
            Name name = NameResolverUtilKt.getName(nameResolver, r4.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r4, typeTable);
            if ((typeInlineClassUnderlyingType != null && (rigidTypeMarker = (RigidTypeMarker) typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (rigidTypeMarker = (RigidTypeMarker) typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, rigidTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r4.getFqName()) + " with property " + name).toString());
        }
        if (!z || !Flags.IS_VALUE_CLASS.get(r4.getFlags()).booleanValue()) {
            return null;
        }
        List<ProtoBuf.Constructor> constructorList = r4.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        Iterator<T> it8 = constructorList.iterator();
        boolean z3 = false;
        Object obj2 = null;
        while (true) {
            if (it8.hasNext()) {
                Object next = it8.next();
                if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                    if (z3) {
                        break;
                    }
                    z3 = true;
                    obj2 = next;
                }
            } else if (!z3) {
                break;
            }
        }
        obj2 = null;
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj2;
        if (constructor == null) {
            return null;
        }
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<ProtoBuf.ValueParameter> list = valueParameterList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ProtoBuf.ValueParameter valueParameter : list) {
            arrayList.add(new Pair(NameResolverUtilKt.getName(nameResolver, valueParameter.getName()), typeDeserializer.invoke(ProtoTypeTableUtilKt.type(valueParameter, typeTable))));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
