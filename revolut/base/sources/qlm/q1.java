package qlm;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class q1 implements SerialDescriptor, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f247697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f247699c;

    public q1(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f247697a = original;
        this.f247698b = original.e() + '?';
        this.f247699c = h1.b(original);
    }

    @Override // qlm.m
    public final Set a() {
        return this.f247699c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f247697a.b(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.f247697a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.f247697a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f247698b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof q1) {
            return Intrinsics.f(this.f247697a, ((q1) obj2).f247697a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f247697a.g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f247697a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return this.f247697a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f247697a.h(i);
    }

    public final int hashCode() {
        return this.f247697a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.f247697a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f247697a.isInline();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f247697a);
        sb6.append('?');
        return sb6.toString();
    }
}
