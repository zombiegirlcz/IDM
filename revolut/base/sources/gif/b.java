package gif;

import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f144171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eif.e f144172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f144173c;

    public b(ImmutableMap transactionsLoaderProviders, eif.e inflaterFactory) {
        Intrinsics.checkNotNullParameter(transactionsLoaderProviders, "transactionsLoaderProviders");
        Intrinsics.checkNotNullParameter(inflaterFactory, "inflaterFactory");
        this.f144171a = transactionsLoaderProviders;
        this.f144172b = inflaterFactory;
        this.f144173c = new LinkedHashMap();
    }
}
