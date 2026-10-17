package bh5;

import aw0.i;
import bb2.t;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import org.jetbrains.annotations.NotNull;
import yhm.r;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoGiftAssetTransferInfoInputData f15227a;

    public c(CryptoGiftAssetTransferInfoInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f15227a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        r rVar = (r) iii.c.f(domainState.f15226a, new b9i.f(this, 26), new t(22), new b88.o(this, 5));
        return new cii.b((i) rVar.f314203c, (List) rVar.f314201a, (m) rVar.f314202b);
    }
}
