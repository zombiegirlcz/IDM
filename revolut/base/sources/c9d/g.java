package c9d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f22355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22356b;

    public g(RowDelegate.Model transaction, List actions) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f22355a = transaction;
        this.f22356b = actions;
    }
}
