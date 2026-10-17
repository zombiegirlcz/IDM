package f1m;

/* JADX INFO: loaded from: classes23.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f1m.h a(android.app.Activity r7) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = r7.getLocalClassName()
            java.lang.String r1 = "activity.localClassName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "format(format, *args)"
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "h"
            java.lang.Class r4 = r7.getClass()
            r5 = 1
            java.lang.String r6 = "snowplowScreenId"
            java.lang.reflect.Field r6 = r4.getField(r6)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            boolean r6 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            if (r6 == 0) goto L2e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            goto L8a
        L2a:
            r7 = move-exception
            goto L4d
        L2c:
            r7 = move-exception
            goto L6a
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            java.lang.String r7 = "The value of field `snowplowScreenId` on Activity `%s` has to be a String."
            java.lang.String r6 = r4.getSimpleName()     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            java.lang.String r7 = java.lang.String.format(r7, r6)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            z0m.j.b(r3, r7, r6)     // Catch: java.lang.Exception -> L2a java.lang.NoSuchFieldException -> L2c
            goto L89
        L4d:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error retrieving value of field `snowplowScreenId`: "
            r1.<init>(r2)
            java.lang.String r2 = r7.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            z0m.j.b(r3, r1, r7)
            goto L89
        L6a:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.String r2 = r4.getSimpleName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r4 = "Field `snowplowScreenId` not found on Activity `%s`."
            java.lang.String r2 = java.lang.String.format(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            z0m.j.a(r3, r2, r7)
        L89:
            r7 = 0
        L8a:
            if (r0 == 0) goto L94
            int r1 = r0.length()
            if (r1 <= 0) goto L94
            r1 = r0
            goto La0
        L94:
            if (r7 == 0) goto L9e
            int r1 = r7.length()
            if (r1 <= 0) goto L9e
            r1 = r7
            goto La0
        L9e:
            java.lang.String r1 = "Unknown"
        La0:
            f1m.h r2 = new f1m.h
            r2.<init>(r1)
            r2.e = r0
            r2.f = r7
            r2.d = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1m.g.a(android.app.Activity):f1m.h");
    }
}
