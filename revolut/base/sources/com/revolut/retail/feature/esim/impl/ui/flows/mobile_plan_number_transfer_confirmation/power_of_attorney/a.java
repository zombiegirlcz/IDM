package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney;

import aii.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements r {
    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a$a, reason: collision with other inner class name */
    public static final class C0615a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100809a;

        public C0615a(boolean z) {
            this.f100809a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0615a) && this.f100809a == ((C0615a) obj2).f100809a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100809a);
        }

        public C0615a() {
            this(false);
        }
    }
}
