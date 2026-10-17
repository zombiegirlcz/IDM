package qlm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class j0 extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f247665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(String name, f0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f247665m = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof j0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
            if (Intrinsics.f(this.f187941a, serialDescriptor.e())) {
                j0 j0Var = (j0) obj2;
                if (j0Var.f247665m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) j0Var.k.getValue())) {
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
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f247665m;
    }
}
