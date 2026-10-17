package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac;

import aii.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements r {
    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a$a, reason: collision with other inner class name */
    public static final class C0614a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100793a;

        public C0614a(boolean z) {
            this.f100793a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0614a) && this.f100793a == ((C0614a) obj2).f100793a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100793a);
        }

        public C0614a() {
            this(false);
        }
    }
}
