package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f187854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187855b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ArrayMapImpl() {
        super(null);
        this.f187854a = new Object[20];
        this.f187855b = 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        return (T) d.W(i, this.f187854a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f187855b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new zhm.b() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187856c = -1;

            @Override // zhm.b
            public final void a() {
                ArrayMapImpl arrayMapImpl;
                do {
                    int i = this.f187856c + 1;
                    this.f187856c = i;
                    arrayMapImpl = ArrayMapImpl.this;
                    if (i >= arrayMapImpl.f187854a.length) {
                        break;
                    }
                } while (arrayMapImpl.f187854a[this.f187856c] == null);
                if (this.f187856c >= arrayMapImpl.f187854a.length) {
                    this.f322461a = 2;
                    return;
                }
                Object obj2 = arrayMapImpl.f187854a[this.f187856c];
                Intrinsics.i(obj2, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                this.f322462b = obj2;
                this.f322461a = 1;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f187854a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.f187854a, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f187854a = objArrCopyOf;
        }
        if (this.f187854a[i] == null) {
            this.f187855b = getSize() + 1;
        }
        this.f187854a[i] = value;
    }
}
