package vm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290514a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ um.a f290515b;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f290514a
            um.a r1 = r5.f290515b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            switch(r0) {
                case 0: goto L2e;
                default: goto L9;
            }
        L9:
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2b
            java.lang.Throwable r6 = r1.f281173b
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            mm.a r1 = r1.f281172a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Action: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            rd0.d.a(r2, r3, r1, r6, r0)
        L2b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L2e:
            java.lang.String r0 = "canBeIgnored"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L49
            mm.a r6 = r1.f281172a
            boolean r0 = r6 instanceof mm.c
            if (r0 == 0) goto L49
            mm.c r6 = (mm.c) r6
            boolean r6 = r6.a()
            if (r6 != 0) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vm.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(d dVar, um.a aVar) {
        this.f290515b = aVar;
    }
}
