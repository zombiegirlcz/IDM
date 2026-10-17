package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ld implements bd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f30585c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gz0 f30586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final od f30587b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ld(gz0 resourcesManager, od countrySupportedUseCase) {
        Intrinsics.checkNotNullParameter(resourcesManager, "resourcesManager");
        Intrinsics.checkNotNullParameter(countrySupportedUseCase, "countrySupportedUseCase");
        this.f30586a = resourcesManager;
        this.f30587b = countrySupportedUseCase;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(cd.a item1, cd.a item2) {
        Intrinsics.checkNotNullParameter(item1, "item1");
        Intrinsics.checkNotNullParameter(item2, "item2");
        boolean zA = a(item1.a());
        boolean zA2 = a(item2.a());
        if (zA && !zA2) {
            return -1;
        }
        if (!zA && zA2) {
            return 1;
        }
        int i = item1.b().f186448a;
        int i2 = item2.b().f186448a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return d81.a(item1.a().getName(), this.f30586a.b()).compareTo(d81.a(item2.a().getName(), this.f30586a.b()));
    }

    private final boolean a(a01 a01Var) {
        fd fdVar = a01Var instanceof fd ? (fd) a01Var : null;
        if (fdVar != null) {
            return this.f30587b.a(fdVar);
        }
        return false;
    }
}
