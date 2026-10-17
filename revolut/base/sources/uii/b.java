package uii;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFlow f280450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f280451b;

    public b(BaseFlow flow, a activityCompatPermissionsWrapper) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(activityCompatPermissionsWrapper, "activityCompatPermissionsWrapper");
        this.f280450a = flow;
        this.f280451b = activityCompatPermissionsWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uii.c a(com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission... r13) {
        /*
            r12 = this;
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            int r0 = r13.length
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        La:
            if (r1 >= r0) goto L53
            r5 = r13[r1]
            com.revolut.kompot.navigable.flow.BaseFlow r6 = r12.f280450a
            android.app.Activity r7 = r6.m2()
            java.lang.String r8 = r5.f98347a
            uii.a r9 = r12.f280451b
            r9.getClass()
            java.lang.String r9 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            java.lang.String r9 = "permission"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r7, r8)
            r8 = -1
            if (r7 != r8) goto L43
            android.app.Activity r6 = r6.m2()
            java.lang.String r10 = r5.f98347a
            java.lang.String r11 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            boolean r6 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r6, r10)
            if (r6 != 0) goto L43
            int r2 = r2 + 1
            goto L50
        L43:
            if (r7 != r8) goto L4c
            boolean r5 = r5.d
            if (r5 == 0) goto L4c
            int r3 = r3 + 1
            goto L50
        L4c:
            if (r7 != r8) goto L50
            int r4 = r4 + 1
        L50:
            int r1 = r1 + 1
            goto La
        L53:
            if (r2 > 0) goto L60
            if (r3 <= 0) goto L58
            goto L60
        L58:
            if (r4 <= 0) goto L5d
            uii.c r13 = uii.c.DENIED
            return r13
        L5d:
            uii.c r13 = uii.c.ALLOWED
            return r13
        L60:
            uii.c r13 = uii.c.EXPLANATION
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: uii.b.a(com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission[]):uii.c");
    }

    public final void b(String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        String[] strArr = (String[]) Arrays.copyOf(keys, keys.length);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (c(str)) {
                arrayList.add(str);
            }
        }
        this.f280450a.L2(YearClass.CLASS_2008, arrayList);
    }

    public final boolean c(String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (keys.length == 0) {
            throw new IllegalStateException(keys + " must be not empty");
        }
        for (String permission : keys) {
            Activity context = this.f280450a.m2();
            this.f280451b.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permission, "permission");
            if (ContextCompat.checkSelfPermission(context, permission) != 0) {
                return true;
            }
        }
        return false;
    }
}
