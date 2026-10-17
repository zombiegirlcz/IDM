package com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list;

import aw0.o9;
import bs5.f;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListDestination;
import ip0.ck0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoTokensListDestination.InputData f71371a;

    public b(CryptoTokensListDestination.InputData inputData, zr5.a rowMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rowMapper, "rowMapper");
        this.f71371a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CryptoTokensListDestination.InputData inputData = this.f71371a;
        ArrayList arrayList = inputData.f71364c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CryptoTokensListDestination.InputData.Item item = (CryptoTokensListDestination.InputData.Item) arrayList.get(i);
            String strM = j6.a.m(i, "crypto_tokens_list_row_", "_", item.f71365a);
            String str = item.f71365a;
            String str2 = item.f71366b;
            CryptoTokensListDestination.InputData.Price price = item.f71367c;
            arrayList2.add(zr5.a.a(strM, str, str2, price.f71368a, price.f71369b, item.d, new CryptoTokensListParcel$TokenClicked(str)));
        }
        TextClause textClause = new TextClause(inputData.f71362a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List listC = u.c(new TextDelegate.Model("crypto_tokens_list_subtitle", new TextClause(inputData.f71363b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new bs5.b(textClause, d0.E0(arrayList2, listC));
    }
}
