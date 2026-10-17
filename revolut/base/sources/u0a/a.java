package u0a;

import ag.d;
import bmm.t;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.data.database.AppRoomDatabase;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.retail.common.ui.R$string;
import efm.d0;
import efm.f0;
import efm.l;
import efm.r;
import io.reactivex.exceptions.CompositeException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import kfm.o;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import no.f2;
import ofm.h;
import pfm.z;
import sab.b;
import ulm.p0;
import wl0.f;
import wl0.g;
import xx9.m;
import yhm.j;
import zi0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements f0, l, zl0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f276162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f276163c;

    public /* synthetic */ a(d0 d0Var, f0 f0Var, int i) {
        this.f276161a = i;
        this.f276163c = d0Var;
        this.f276162b = f0Var;
    }

    @Override // zl0.a
    public g a() {
        return new g((String) this.f276162b, z2l.a.f319097a.getString(R$string.common_action_cancel), EnumSet.of(b.SIGN_2FA, b.SIGN_CONFIRM_GOOGLE_PAY, b.SIGN_CONFIRM_GOOGLE_PAY_VISA).contains(((LoginFragment) this.f276163c).f0));
    }

    @Override // zl0.a
    public f b() {
        String str = (String) this.f276162b;
        int i = com.revolut.feature.retail.legacy.login.impl.R$string.fingerprint_error_title;
        z2l.a aVar = z2l.a.f319097a;
        String string = aVar.getString(i);
        String string2 = aVar.getString(com.revolut.feature.retail.legacy.login.impl.R$string.fingerprint_error_block_title_v2);
        PinCodeView pinCodeView = ((LoginFragment) this.f276163c).m0;
        if (pinCodeView != null) {
            return new f(str, string, string2, pinCodeView.getFingerprintLabel());
        }
        Intrinsics.r("pinCodeView");
        throw null;
    }

    public ve.b c() {
        return new ve.b((String) this.f276162b, ((HashMap) this.f276163c) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.f276163c)));
    }

    public d0 d(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ufm.g gVar = (ufm.g) this.f276163c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        r rVarSubscribeOn = r.defer(new d(gVar, params, 5)).subscribeOn(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        d0 d0VarFirstOrError = rVarSubscribeOn.firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public r e(boolean z) {
        Lazy lazy = (Lazy) this.f276163c;
        ArrayList arrayList = (ArrayList) this.f276162b;
        r rVarDistinctUntilChanged = ((arrayList.isEmpty() || z) ? (r) lazy.getValue() : ((r) lazy.getValue()).startWith(c.P(zhm.d0.d1(arrayList), false, null, 3))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public void f(Annotation annotation) {
        if (((HashMap) this.f276163c) == null) {
            this.f276163c = new HashMap();
        }
        ((HashMap) this.f276163c).put(annotation.annotationType(), annotation);
    }

    @Override // efm.l
    public void onComplete() {
        ((l) this.f276163c).onComplete();
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        Object objApply;
        switch (this.f276161a) {
            case 1:
                ((f0) this.f276162b).onError(th10);
                break;
            case 2:
                ((l) this.f276163c).onError(th10);
                break;
            default:
                f0 f0Var = (f0) this.f276162b;
                z zVar = (z) this.f276163c;
                o oVar = (o) zVar.d;
                if (oVar != null) {
                    try {
                        objApply = oVar.apply(th10);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        f0Var.onError(new CompositeException(th10, th11));
                        return;
                    }
                } else {
                    objApply = zVar.f235779b;
                }
                if (objApply != null) {
                    f0Var.onSuccess(objApply);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th10);
                    f0Var.onError(nullPointerException);
                }
                break;
        }
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        switch (this.f276161a) {
            case 1:
                ((f0) this.f276162b).onSubscribe(cVar);
                break;
            case 2:
                lfm.d.c((h) this.f276162b, cVar);
                break;
            default:
                ((f0) this.f276162b).onSubscribe(cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f276161a) {
            case 1:
                f0 f0Var = (f0) this.f276162b;
                try {
                    ((ufm.f) this.f276163c).f279883c.accept(obj2);
                    f0Var.onSuccess(obj2);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    f0Var.onError(th10);
                    return;
                }
                break;
            case 2:
                ((l) this.f276163c).onSuccess(obj2);
                break;
            default:
                ((f0) this.f276162b).onSuccess(obj2);
                break;
        }
    }

    public /* synthetic */ a(Serializable serializable, Object obj2, int i) {
        this.f276161a = i;
        this.f276162b = serializable;
        this.f276163c = obj2;
    }

    public a(m cacheLoader) {
        this.f276161a = 10;
        Intrinsics.checkNotNullParameter(cacheLoader, "cacheLoader");
        this.f276162b = new ArrayList();
        this.f276163c = j.b(new t(cacheLoader, this, 17));
    }

    public a(AppRoomDatabase database) {
        this.f276161a = 6;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f276162b = database;
        this.f276163c = j.b(new p0(this, 7));
    }

    public a(cv9.a encryptionInteractor, qv9.a base64Wrapper) {
        this.f276161a = 4;
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f276162b = encryptionInteractor;
        this.f276163c = base64Wrapper;
    }

    public a(uu9.f pushChatSenderMapper, yf.c contactsNameReplacer) {
        this.f276161a = 0;
        Intrinsics.checkNotNullParameter(pushChatSenderMapper, "pushChatSenderMapper");
        Intrinsics.checkNotNullParameter(contactsNameReplacer, "contactsNameReplacer");
        this.f276162b = pushChatSenderMapper;
        this.f276163c = contactsNameReplacer;
    }

    public a(com.google.firebase.messaging.t eodRatesRepository, e dateProvider) {
        this.f276161a = 8;
        Intrinsics.checkNotNullParameter(eodRatesRepository, "eodRatesRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f276162b = eodRatesRepository;
        this.f276163c = dateProvider;
    }

    public a(Function1 load) {
        this.f276161a = 7;
        Intrinsics.checkNotNullParameter(load, "load");
        this.f276162b = load;
        this.f276163c = new ufm.g(new f2(this, 21));
    }

    public a(String str) {
        this.f276161a = 5;
        this.f276163c = null;
        this.f276162b = str;
    }
}
