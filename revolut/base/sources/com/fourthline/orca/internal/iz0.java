package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class iz0 implements id0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29762c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf0 f29763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29764b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public iz0(hf0 repository, int i) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f29763a = repository;
        this.f29764b = i;
    }

    @Override // com.fourthline.orca.internal.id0
    public boolean a(hd0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this.f29763a.g() >= this.f29764b;
    }
}
