package ub;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f278715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f278716c;
    public final MutableState d;

    public f(String permission, Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f278714a = permission;
        this.f278715b = context;
        this.f278716c = activity;
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a(), null, 2, null);
    }

    @Override // ub.g
    public final String W0() {
        return this.f278714a;
    }

    public final j a() {
        Context context = this.f278715b;
        Intrinsics.checkNotNullParameter(context, "<this>");
        String permission = this.f278714a;
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (ContextCompat.checkSelfPermission(context, permission) == 0) {
            return i.f278718a;
        }
        Activity activity = this.f278716c;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return new h(ActivityCompat.shouldShowRequestPermissionRationale(activity, permission));
    }

    @Override // ub.g
    public final j getStatus() {
        return (j) this.d.getValue();
    }
}
