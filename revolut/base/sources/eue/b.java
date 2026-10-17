package eue;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f129551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f129552c;
    public final Lazy d;

    public b(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f129550a = date;
        final int i = 0;
        this.f129551b = j.b(new Function0(this) { // from class: eue.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f129549b;

            {
                this.f129549b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r7 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L6c;
                        case 1: goto L46;
                        default: goto L5;
                    }
                L5:
                    eue.b r0 = r7.f129549b
                    java.lang.String r0 = r0.f129550a
                    int r1 = r0.length()
                    r2 = 0
                    r3 = 4
                    if (r1 == r3) goto L12
                    goto L41
                L12:
                    org.joda.time.LocalDate r1 = org.joda.time.LocalDate.now()
                    int r4 = r1.getYear()
                    int r4 = r4 % 100
                    r5 = 2
                    java.lang.String r3 = r0.substring(r5, r3)
                    java.lang.String r6 = "substring(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                    int r3 = java.lang.Integer.parseInt(r3)
                    if (r4 <= r3) goto L2d
                    goto L40
                L2d:
                    if (r4 != r3) goto L41
                    int r1 = r1.getMonthOfYear()
                    java.lang.String r0 = r0.substring(r2, r5)
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                    int r0 = java.lang.Integer.parseInt(r0)
                    if (r1 <= r0) goto L41
                L40:
                    r2 = 1
                L41:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L46:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    boolean r1 = kotlin.text.d0.W(r1)
                    r2 = 1
                    if (r1 == 0) goto L52
                    goto L67
                L52:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L66
                    boolean r1 = kotlin.text.d0.W(r0)
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L66
                    java.lang.String r1 = "^(1[0-2]\\d{0,2}|0[1-9]\\d{0,2}|[01])$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L66
                    goto L67
                L66:
                    r2 = 0
                L67:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L6c:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    int r1 = r1.length()
                    r2 = 4
                    if (r1 == r2) goto L78
                    goto L8d
                L78:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L8d
                    boolean r1 = kotlin.text.d0.W(r0)
                    r2 = 1
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L8d
                    java.lang.String r1 = "^(1[0-2]|0[1-9])\\d\\d$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L8d
                    goto L8e
                L8d:
                    r2 = 0
                L8e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: eue.a.invoke():java.lang.Object");
            }
        });
        final int i2 = 1;
        this.f129552c = j.b(new Function0(this) { // from class: eue.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f129549b;

            {
                this.f129549b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L6c;
                        case 1: goto L46;
                        default: goto L5;
                    }
                L5:
                    eue.b r0 = r7.f129549b
                    java.lang.String r0 = r0.f129550a
                    int r1 = r0.length()
                    r2 = 0
                    r3 = 4
                    if (r1 == r3) goto L12
                    goto L41
                L12:
                    org.joda.time.LocalDate r1 = org.joda.time.LocalDate.now()
                    int r4 = r1.getYear()
                    int r4 = r4 % 100
                    r5 = 2
                    java.lang.String r3 = r0.substring(r5, r3)
                    java.lang.String r6 = "substring(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                    int r3 = java.lang.Integer.parseInt(r3)
                    if (r4 <= r3) goto L2d
                    goto L40
                L2d:
                    if (r4 != r3) goto L41
                    int r1 = r1.getMonthOfYear()
                    java.lang.String r0 = r0.substring(r2, r5)
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                    int r0 = java.lang.Integer.parseInt(r0)
                    if (r1 <= r0) goto L41
                L40:
                    r2 = 1
                L41:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L46:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    boolean r1 = kotlin.text.d0.W(r1)
                    r2 = 1
                    if (r1 == 0) goto L52
                    goto L67
                L52:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L66
                    boolean r1 = kotlin.text.d0.W(r0)
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L66
                    java.lang.String r1 = "^(1[0-2]\\d{0,2}|0[1-9]\\d{0,2}|[01])$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L66
                    goto L67
                L66:
                    r2 = 0
                L67:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L6c:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    int r1 = r1.length()
                    r2 = 4
                    if (r1 == r2) goto L78
                    goto L8d
                L78:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L8d
                    boolean r1 = kotlin.text.d0.W(r0)
                    r2 = 1
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L8d
                    java.lang.String r1 = "^(1[0-2]|0[1-9])\\d\\d$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L8d
                    goto L8e
                L8d:
                    r2 = 0
                L8e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: eue.a.invoke():java.lang.Object");
            }
        });
        final int i3 = 2;
        this.d = j.b(new Function0(this) { // from class: eue.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f129549b;

            {
                this.f129549b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L6c;
                        case 1: goto L46;
                        default: goto L5;
                    }
                L5:
                    eue.b r0 = r7.f129549b
                    java.lang.String r0 = r0.f129550a
                    int r1 = r0.length()
                    r2 = 0
                    r3 = 4
                    if (r1 == r3) goto L12
                    goto L41
                L12:
                    org.joda.time.LocalDate r1 = org.joda.time.LocalDate.now()
                    int r4 = r1.getYear()
                    int r4 = r4 % 100
                    r5 = 2
                    java.lang.String r3 = r0.substring(r5, r3)
                    java.lang.String r6 = "substring(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                    int r3 = java.lang.Integer.parseInt(r3)
                    if (r4 <= r3) goto L2d
                    goto L40
                L2d:
                    if (r4 != r3) goto L41
                    int r1 = r1.getMonthOfYear()
                    java.lang.String r0 = r0.substring(r2, r5)
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                    int r0 = java.lang.Integer.parseInt(r0)
                    if (r1 <= r0) goto L41
                L40:
                    r2 = 1
                L41:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L46:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    boolean r1 = kotlin.text.d0.W(r1)
                    r2 = 1
                    if (r1 == 0) goto L52
                    goto L67
                L52:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L66
                    boolean r1 = kotlin.text.d0.W(r0)
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L66
                    java.lang.String r1 = "^(1[0-2]\\d{0,2}|0[1-9]\\d{0,2}|[01])$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L66
                    goto L67
                L66:
                    r2 = 0
                L67:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L6c:
                    eue.b r0 = r7.f129549b
                    java.lang.String r1 = r0.f129550a
                    int r1 = r1.length()
                    r2 = 4
                    if (r1 == r2) goto L78
                    goto L8d
                L78:
                    java.lang.String r0 = r0.f129550a
                    if (r0 == 0) goto L8d
                    boolean r1 = kotlin.text.d0.W(r0)
                    r2 = 1
                    r1 = r1 ^ r2
                    if (r1 != r2) goto L8d
                    java.lang.String r1 = "^(1[0-2]|0[1-9])\\d\\d$"
                    boolean r0 = ch.qos.logback.core.util.a.x(r1, r0)
                    if (r0 == 0) goto L8d
                    goto L8e
                L8d:
                    r2 = 0
                L8e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: eue.a.invoke():java.lang.Object");
            }
        });
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f129550a, ((b) obj2).f129550a);
    }

    public final int hashCode() {
        return this.f129550a.hashCode();
    }
}
