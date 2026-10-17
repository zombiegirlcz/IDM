package fkl;

import android.content.Context;
import ipa.j;
import ipa.k;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements hpa.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f135867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f135868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f135869c;
    public final z1 d;

    public h(Context context, uil.a revolutAccountsManager, CoroutineScope scope, ue0.c storage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f135867a = context;
        this.f135868b = scope;
        this.f135869c = storage;
        this.d = ta6.a.a(0);
    }

    @Override // hpa.a
    public final boolean b(j message) {
        String upperCase;
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = k.b(message);
        Continuation continuation = null;
        if (strB != null) {
            upperCase = strB.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (!Intrinsics.f(upperCase, "LOGOUT_EVENT")) {
            return false;
        }
        Context context = this.f135867a;
        qqk.b bVar = (qqk.b) ue0.e.i(ue0.e.j(context), qqk.b.class);
        if ((bVar != null ? bVar.a() : null) == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Please, ensure the provider is available in app's declaration");
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e()) {
                throw illegalStateException;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return true;
        }
        qqk.b bVar2 = (qqk.b) ue0.e.i(ue0.e.j(context), qqk.b.class);
        rqk.k kVarA = bVar2 != null ? bVar2.a() : null;
        if (kVarA != null && kVarA.o.a() == asi.c.ABSENT) {
            return true;
        }
        p0 p0Var = p0.f264001a;
        e0.C(this.f135868b, elm.f.f127540b, null, new ewa.d(this, continuation, 25), 2);
        return true;
    }
}
