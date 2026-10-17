package com.fourthline.orca.internal;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lq0 implements oy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30727b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30728c = 8;
    private static final List d = zhm.v.k(0, 45, 90, 135, 180, Integer.valueOf(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE), 270, 315);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f30729a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public lq0(List steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f30729a = steps;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r0.add(r3);
        r1 = r1 + 1;
     */
    @Override // com.fourthline.orca.internal.oy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(int r7) {
        /*
            r6 = this;
            aim.e r0 = zhm.u.b()
            r1 = 0
        L5:
            if (r1 >= r7) goto L5d
            java.util.List r2 = com.fourthline.orca.internal.lq0.d
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.List r2 = zhm.d0.g1(r2)
            java.util.Collections.shuffle(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L4f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L1b
            java.lang.Object r5 = zhm.d0.m0(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r5 = r5 - r4
            int r4 = java.lang.Math.abs(r5)
            r5 = 90
            if (r4 < r5) goto L1b
        L4f:
            r0.add(r3)
            int r1 = r1 + 1
            goto L5
        L55:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        L5d:
            aim.e r7 = zhm.u.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lq0.a(int):java.util.List");
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof lq0) && Intrinsics.f(this.f30729a, ((lq0) obj2).f30729a);
    }

    public int hashCode() {
        return this.f30729a.hashCode();
    }

    public String toString() {
        return "PredefinedRandomConfig(steps=" + this.f30729a + ")";
    }

    public /* synthetic */ lq0(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d : list);
    }
}
