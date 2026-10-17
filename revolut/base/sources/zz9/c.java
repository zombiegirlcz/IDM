package zz9;

import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zul.l0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements kfm.p, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f326604a;

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        l0 l0Var = (l0) this.f326604a;
        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (v) l0Var.invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        l0 l0Var = (l0) this.f326604a;
        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) l0Var.invoke(p0)).booleanValue();
    }
}
