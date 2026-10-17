package rlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f255094b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f255095c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qlm.d f255096a = nlm.a.a(k.f255111a).f247633b;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f255096a.b(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        this.f255096a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        this.f255096a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return f255095c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f255096a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f255096a.g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f255096a.getClass();
        return f0.f322471a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        this.f255096a.getClass();
        return olm.k.f226488c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f255096a.h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        this.f255096a.i(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f255096a.getClass();
        return false;
    }
}
