package kbb;

import aii.u;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f182545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f182546b;

    public a(ImmutableSet decorators, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(decorators, "decorators");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f182545a = decorators;
        this.f182546b = featureToggleInteractor;
    }

    public final u a(MainContainerScreenDestination.JustShow destination) {
        u uVarA;
        ProductAccountId f89728b;
        ProductAccountId.Payload payload;
        ProductId f89727a;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it8 = this.f182545a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                uVarA = null;
                break;
            }
            uVarA = ((ibb.a) it8.next()).a(destination);
            if (uVarA != null) {
                break;
            }
        }
        if (uVarA == null) {
            return null;
        }
        Parcelable parcelable = destination.f83416c;
        TabAccountsLaunchConfig tabAccountsLaunchConfig = parcelable instanceof TabAccountsLaunchConfig ? (TabAccountsLaunchConfig) parcelable : null;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = tabAccountsLaunchConfig != null ? tabAccountsLaunchConfig.f89544a : null;
        IllegalStateException illegalStateException = new IllegalStateException(v0.a.i(v0.a.m("A product account reached the ", destination.f83414a, " tab via a plain command. productId=", (productAccountDescriptor$Value == null || (f89727a = productAccountDescriptor$Value.getF89727a()) == null) ? null : f89727a.getId(), ", payloadType="), (productAccountDescriptor$Value == null || (f89728b = productAccountDescriptor$Value.getF89728b()) == null || (payload = f89728b.f89730b) == null) ? null : payload.getClass().getSimpleName(), ". Open product accounts via ProductAccountDestinationResolver so they land in their owning tab."));
        if (!((jte.d) this.f182546b).c(TabAccountsApi$Toggles.ProductAccountOwningTabGuardSuppressCrash.f89459c)) {
            hx7.e.h(illegalStateException);
            return uVarA;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return uVarA;
    }
}
