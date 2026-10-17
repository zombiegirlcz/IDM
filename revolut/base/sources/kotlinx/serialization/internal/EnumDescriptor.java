package kotlinx.serialization.internal;

import ch.qos.logback.core.CoreConstants;
import cli.b;
import com.bumptech.glide.d;
import j6.a;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import olm.h;
import olm.j;
import qlm.h1;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f187939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f187940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String name, int i) {
        super(name, null, i);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f187939m = j.f226486b;
        this.f187940n = yhm.j.b(new b(i, 3, name, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return ((SerialDescriptor[]) this.f187940n.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
        return serialDescriptor.getKind() == j.f226486b && Intrinsics.f(this.f187941a, serialDescriptor.e()) && Intrinsics.f(h1.b(this), h1.b(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final d getKind() {
        return this.f187939m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.f187941a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        h hVar = new h(this);
        int iHashCode2 = 1;
        while (hVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) hVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return d0.k0(new ge0.b(this, 3), ", ", a.u(new StringBuilder(), this.f187941a, CoreConstants.LEFT_PARENTHESIS_CHAR), ")", 0, null, 56);
    }
}
