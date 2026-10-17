package tl6;

import cli.n;
import cli.o;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InactiveConsentsListScreenContract$InputData f272006a;

    public m(InactiveConsentsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f272006a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f272003a, new tif.g(19), new tj9.d(11), new tch.c(this, 4)));
    }
}
