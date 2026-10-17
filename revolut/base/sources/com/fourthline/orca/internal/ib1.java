package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ib1 {

    public static final class a implements eb1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ee1 f29552a;

        public a(ee1 ee1Var) {
            this.f29552a = ee1Var;
        }

        @Override // com.fourthline.orca.internal.eb1
        public ee1 a() {
            return this.f29552a;
        }
    }

    public static final eb1 a(ee1 back) {
        Intrinsics.checkNotNullParameter(back, "back");
        return new a(back);
    }
}
