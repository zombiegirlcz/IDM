package gu1;

import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.core.ui.error.ErrorNotHandledException;
import com.revolut.revolut.feature_fourthline_impl.R;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d12.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu1.a f146658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1l.a f146659b;

    public c(eu1.a blikInteractor, e1l.a errorHandler) {
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.f146658a = blikInteractor;
        this.f146659b = errorHandler;
    }

    @Override // d12.b
    public final z a(Throwable error) {
        z zVarE;
        Object next;
        Intrinsics.checkNotNullParameter(error, "throwable");
        Intrinsics.checkNotNullParameter(error, "error");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "APM-BLIK", v1.c.u("Blik Entry: Error: ", error), null, null, 16);
        if (error instanceof HandledNetworkException) {
            zVarE = null;
        } else {
            e1l.a aVar = this.f146659b;
            sf0.h hVar = aVar.f122001c;
            if (error instanceof ErrorNotHandledException) {
                zVarE = e1l.a.c();
            } else if (error instanceof CompositeException) {
                List list = ((CompositeException) error).f163108a;
                Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof HttpException) {
                        break;
                    }
                }
                if (!(next instanceof HttpException)) {
                    next = null;
                }
                HttpException httpException = (HttpException) next;
                zVarE = aVar.e(httpException != null ? hVar.c(httpException) : null);
            } else {
                zVarE = error instanceof HttpException ? aVar.e(hVar.c((HttpException) error)) : e1l.a.c();
            }
        }
        return zVarE == null ? new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764) : zVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d12.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu1.c.b(gim.c):java.lang.Object");
    }
}
