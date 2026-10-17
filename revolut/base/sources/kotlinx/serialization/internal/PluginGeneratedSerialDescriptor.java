package kotlinx.serialization.internal;

import com.bumptech.glide.d;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import qlm.f0;
import qlm.j1;
import qlm.m;
import yhm.j;
import yhm.k;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f187942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187943c;
    public int d;
    public final String[] e;
    public final List[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f187944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f187945h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f187946j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f187947l;

    public PluginGeneratedSerialDescriptor(String serialName, f0 f0Var, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f187941a = serialName;
        this.f187942b = f0Var;
        this.f187943c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.f187943c;
        this.f = new List[i3];
        this.f187945h = new boolean[i3];
        this.i = r0.g();
        k kVar = k.PUBLICATION;
        final int i5 = 0;
        this.f187946j = j.c(kVar, new Function0(this) { // from class: qlm.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f247661b;

            {
                this.f247661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        f0 f0Var2 = this.f247661b.f187942b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? j1.f247666a : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f247661b.f187942b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return h1.c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f247661b;
                        return Integer.valueOf(j1.c(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
        final int i6 = 1;
        this.k = j.c(kVar, new Function0(this) { // from class: qlm.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f247661b;

            {
                this.f247661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        f0 f0Var2 = this.f247661b.f187942b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? j1.f247666a : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f247661b.f187942b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return h1.c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f247661b;
                        return Integer.valueOf(j1.c(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
        final int i21 = 2;
        this.f187947l = j.c(kVar, new Function0(this) { // from class: qlm.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f247661b;

            {
                this.f247661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i21) {
                    case 0:
                        f0 f0Var2 = this.f247661b.f187942b;
                        return (f0Var2 == null || (kSerializerArrChildSerializers = f0Var2.childSerializers()) == null) ? j1.f247666a : kSerializerArrChildSerializers;
                    case 1:
                        f0 f0Var3 = this.f247661b.f187942b;
                        if (f0Var3 == null || (kSerializerArrTypeParametersSerializers = f0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return h1.c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f247661b;
                        return Integer.valueOf(j1.c(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // qlm.m
    public final Set a() {
        return this.i.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor b(int i) {
        return ((KSerializer[]) this.f187946j.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.f187943c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f187941a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
            if (Intrinsics.f(this.f187941a, serialDescriptor.e()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj2).k.getValue())) {
                int iC = serialDescriptor.c();
                int i = this.f187943c;
                if (i == iC) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.f(b(i2).e(), serialDescriptor.b(i2).e()) && Intrinsics.f(b(i2).getKind(), serialDescriptor.b(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.f187944g;
        return arrayList == null ? zhm.f0.f322471a : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public d getKind() {
        return olm.k.f226487b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? zhm.f0.f322471a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public int hashCode() {
        return ((Number) this.f187947l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.f187945h[i];
    }

    public final void j(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.f187945h[i] = z;
        this.f[i] = null;
        if (i == this.f187943c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = map;
        }
    }

    public final void k(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        int i = this.d;
        List[] listArr = this.f;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void l(Annotation a7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        if (this.f187944g == null) {
            this.f187944g = new ArrayList(1);
        }
        ArrayList arrayList = this.f187944g;
        Intrinsics.h(arrayList);
        arrayList.add(a7);
    }

    public String toString() {
        return j1.i(this);
    }
}
