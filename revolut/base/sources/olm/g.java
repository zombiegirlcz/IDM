package olm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qlm.h1;
import qlm.j1;
import zhm.d0;
import zhm.q;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements SerialDescriptor, qlm.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.d f226476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f226477c;
    public final List d;
    public final HashSet e;
    public final String[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f226478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f226479h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f226480j;
    public final SerialDescriptor[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f226481l;

    public g(String serialName, com.bumptech.glide.d kind, int i, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f226475a = serialName;
        this.f226476b = kind;
        this.f226477c = i;
        this.d = builder.f226462b;
        ArrayList arrayList = builder.f226463c;
        this.e = d0.b1(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.f226478g = h1.c(builder.e);
        this.f226479h = (List[]) builder.f.toArray(new List[0]);
        this.i = d0.X0(builder.f226464g);
        q qVarZ0 = kotlin.collections.d.z0(strArr);
        ArrayList arrayList2 = new ArrayList(w.t(qVarZ0, 10));
        Iterator it8 = qVarZ0.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                this.f226480j = r0.t(arrayList2);
                this.k = h1.c(typeParameters);
                this.f226481l = yhm.j.b(new o10.c(this, 22));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            arrayList2.add(new Pair(indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a)));
        }
    }

    @Override // qlm.m
    public final Set a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f226478g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.f226477c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f226475a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
            if (Intrinsics.f(this.f226475a, serialDescriptor.e()) && Arrays.equals(this.k, ((g) obj2).k)) {
                int iC = serialDescriptor.c();
                int i = this.f226477c;
                if (i == iC) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.f226478g;
                        if (Intrinsics.f(serialDescriptorArr[i2].e(), serialDescriptor.b(i2).e()) && Intrinsics.f(serialDescriptorArr[i2].getKind(), serialDescriptor.b(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f226480j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return this.f226476b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f226479h[i];
    }

    public final int hashCode() {
        return ((Number) this.f226481l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return j1.i(this);
    }
}
