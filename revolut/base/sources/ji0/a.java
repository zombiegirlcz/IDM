package ji0;

import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.Task;
import gi0.b;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import mhd.c;
import pfm.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f174318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f174319b;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f174318a = context;
        this.f174319b = p.a.h("toSerialized(...)");
    }

    public final h a() {
        Task<Void> taskStartSmsRetriever = SmsRetriever.getClient(this.f174318a).startSmsRetriever();
        Intrinsics.checkNotNullExpressionValue(taskStartSmsRetriever, "startSmsRetriever(...)");
        Intrinsics.checkNotNullParameter(taskStartSmsRetriever, "<this>");
        h hVar = new h(new c(taskStartSmsRetriever, 3), 0);
        Intrinsics.checkNotNullExpressionValue(hVar, "create(...)");
        return hVar;
    }
}
