package ts1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements jki.p {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f273942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.e f273943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.o f273944c;
    public final vs1.b d;
    public final ty9.b e;

    public w(a12.j apmAreaMapper, a12.e contactsMapper, a12.o transactionsMapper, vs1.b subscriptionsMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(subscriptionsMapper, "subscriptionsMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f273942a = apmAreaMapper;
        this.f273943b = contactsMapper;
        this.f273944c = transactionsMapper;
        this.d = subscriptionsMapper;
        this.e = sendFromClipboardItemProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        eVarB.add(a12.j.a(this.f273942a, zhm.v.k(a.Send, a.Request, a.AddContact)));
        RowDelegate.Model modelA = ty9.b.a(this.e);
        if (modelA != null) {
            eVarB.add(modelA);
        }
        eVarB.addAll((List) iii.c.f(domainState.f273920a, new tpi.g(this, 18), new tq0.j(7), new si5.c(domainState, this, 24)));
        return new f(zhm.u.a(eVarB));
    }
}
