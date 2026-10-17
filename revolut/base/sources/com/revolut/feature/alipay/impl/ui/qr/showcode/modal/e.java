package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import b1c.p;
import bl1.f;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.alipay.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk1.c f61088a;

    public e(zk1.c codeImageFactory) {
        Intrinsics.checkNotNullParameter(codeImageFactory, "codeImageFactory");
        this.f61088a = codeImageFactory;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i2 = d.f61087a[domainState.f61085b.ordinal()];
        if (i2 == 1) {
            i = R$string.alipay_plus_show_code_barcode;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.alipay_plus_show_code_qr_code;
        }
        return new bl1.e(new TextLocalisedClause(i, null, null, 14), (List) iii.c.f(domainState.f61084a, new bjg.c(this, 23), new bk6.n(this), new p(this, domainState, 15)));
    }
}
