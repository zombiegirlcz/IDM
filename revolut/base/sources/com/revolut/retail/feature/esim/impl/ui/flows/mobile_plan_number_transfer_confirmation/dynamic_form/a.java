package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form;

import aii.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements r {
    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.a$a, reason: collision with other inner class name */
    public static final class C0611a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100740a;

        public C0611a(boolean z) {
            this.f100740a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0611a) && this.f100740a == ((C0611a) obj2).f100740a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100740a);
        }

        public C0611a() {
            this(false);
        }
    }
}
