package rlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qlm.g0;
import qlm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class u implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f255122b = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f255123c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f255124a;

    public u() {
        nlm.a.d(t0.f186434a);
        this.f255124a = nlm.a.b(v1.f247718a, k.f255111a).d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f255124a.b(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        this.f255124a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        this.f255124a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return f255123c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f255124a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f255124a.g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f255124a.getClass();
        return f0.f322471a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        this.f255124a.getClass();
        return olm.k.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f255124a.h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        this.f255124a.i(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f255124a.getClass();
        return false;
    }
}
