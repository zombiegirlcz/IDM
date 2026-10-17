package slm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlm.a0 f264276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f264277b;

    public p(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f264276a = new qlm.a0(descriptor, new rch.o(this));
    }
}
