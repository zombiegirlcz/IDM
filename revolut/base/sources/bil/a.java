package bil;

import com.google.common.collect.ImmutableMap;
import dsh.g;
import fsh.c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15531a;

    public a(Map keyMappers) {
        Intrinsics.checkNotNullParameter(keyMappers, "keyMappers");
        this.f15531a = keyMappers;
    }

    public a(ImmutableMap actionHandlers, int i) {
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(actionHandlers, "actionHandlers");
                this.f15531a = actionHandlers;
                break;
            default:
                Intrinsics.checkNotNullParameter(actionHandlers, "uiBlockProviders");
                this.f15531a = actionHandlers;
                break;
        }
    }

    public a(g holderBuilder, c contentProvidersAdapter, ImmutableMap cryptoContentProviders, p46.a cryptoContextAdapter) {
        Intrinsics.checkNotNullParameter(holderBuilder, "holderBuilder");
        Intrinsics.checkNotNullParameter(contentProvidersAdapter, "contentProvidersAdapter");
        Intrinsics.checkNotNullParameter(cryptoContentProviders, "cryptoContentProviders");
        Intrinsics.checkNotNullParameter(cryptoContextAdapter, "cryptoContextAdapter");
        this.f15531a = cryptoContentProviders;
    }
}
