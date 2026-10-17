package qfh;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f245352b;

    public a(Context context, int i) {
        this.f245351a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f245352b = context;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f245352b = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f245352b = context;
                break;
        }
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f245351a) {
            case 0:
                this.f245352b.deleteDatabase("wealth_private_equity");
                break;
            case 1:
                this.f245352b.deleteDatabase("savings_db");
                break;
            default:
                this.f245352b.deleteDatabase("insurance_db");
                break;
        }
    }
}
