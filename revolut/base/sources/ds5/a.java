package ds5;

import aii.u;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListDestination;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListScreen;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoTokensListDestination) {
            return new CryptoTokensListScreen(((CryptoTokensListDestination) destination).f71361b);
        }
        return null;
    }
}
