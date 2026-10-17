package com.revolut.feature.shared_separate_favourites.api.multiple_watchlists;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/multiple_watchlists/MultipleWatchlistsCustomisationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lnfd/a;", "Lcom/revolut/feature/shared_separate_favourites/api/multiple_watchlists/MultipleWatchlistsCustomisationScreen$a;", "<init>", "()V", "a", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MultipleWatchlistsCustomisationScreen extends BaseBottomSheetRecyclerController<nfd.a, a> {

    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Data f86793a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f86793a, ((a) obj2).f86793a);
        }

        public final int hashCode() {
            return this.f86793a.hashCode();
        }

        public a(Data watchlists) {
            Intrinsics.checkNotNullParameter(watchlists, "watchlists");
            this.f86793a = watchlists;
        }

        public /* synthetic */ a(int i) {
            this(new Data(null, null, true, 3, null));
        }
    }
}
