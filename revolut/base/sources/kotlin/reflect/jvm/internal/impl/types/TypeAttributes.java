package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAttributes f187798b = new TypeAttributes(f0.f322471a);

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final Collection access$getIndices(Companion companion) {
            Collection collectionValues = companion.f187871a.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            return collectionValues;
        }

        @NotNull
        public final TypeAttributes create(@NotNull List<? extends TypeAttribute<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? getEmpty() : new TypeAttributes(attributes, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String key, @NotNull Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return iIntValue;
        }

        @NotNull
        public final TypeAttributes getEmpty() {
            return TypeAttributes.f187798b;
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @NotNull
    public final TypeAttributes add(@NotNull TypeAttributes other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = Companion.access$getIndices(Companion).iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.f187857a.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.f187857a.get(iIntValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null : typeAttribute.add(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final Companion b() {
        return Companion;
    }

    public final boolean contains(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return this.f187857a.get(Companion.getId(attribute.getKey())) != null;
    }

    @NotNull
    public final TypeAttributes intersect(@NotNull TypeAttributes other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = Companion.access$getIndices(Companion).iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.f187857a.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.f187857a.get(iIntValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null : typeAttribute.intersect(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    @NotNull
    public final TypeAttributes plus(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(u.c(attribute));
        }
        return Companion.create(d0.F0(attribute, d0.d1(this)));
    }

    @NotNull
    public final TypeAttributes remove(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            ArrayMap arrayMap = this.f187857a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayMap) {
                if (!Intrinsics.f((TypeAttribute) obj2, attribute)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() != this.f187857a.getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    public TypeAttributes(List list) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            TypeAttribute value = (TypeAttribute) it8.next();
            KClass tClass = value.getKey();
            Intrinsics.checkNotNullParameter(tClass, "tClass");
            Intrinsics.checkNotNullParameter(value, "value");
            String keyQualifiedName = tClass.e();
            Intrinsics.h(keyQualifiedName);
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            Intrinsics.checkNotNullParameter(value, "value");
            int id10 = b().getId(keyQualifiedName);
            int size = this.f187857a.getSize();
            if (size != 0) {
                if (size == 1) {
                    ArrayMap arrayMap = this.f187857a;
                    try {
                        Intrinsics.i(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                        if (oneElementArrayMap.getIndex() == id10) {
                            this.f187857a = new OneElementArrayMap(value, id10);
                        } else {
                            ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                            arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                            this.f187857a = arrayMapImpl;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(c(arrayMap, 1, "OneElementArrayMap"), e);
                    }
                }
                this.f187857a.set(id10, value);
            } else {
                ArrayMap arrayMap2 = this.f187857a;
                if (!(arrayMap2 instanceof EmptyArrayMap)) {
                    throw new IllegalStateException(c(arrayMap2, 0, "EmptyArrayMap"));
                }
                this.f187857a = new OneElementArrayMap(value, id10);
            }
        }
    }
}
