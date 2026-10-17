package rlm;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class l implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f255113a;

    public l(Function0 function0) {
        this.f255113a = yhm.j.b(function0);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.f255113a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return a().b(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return a().c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return a().d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return a().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a().g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return a().h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return a().i(i);
    }
}
