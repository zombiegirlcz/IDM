package a09;

import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.a f249b;

    public c(LearnService service, ne0.d memoryCache, hz8.a dao, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f248a = service;
        this.f249b = dao;
        new w4l.f(new a08.n(this, 2), new a(this, 0), new a08.n(this, 3), new a(1), new a08.n(4), null, null, null, BERTags.FLAGS);
        new w4l.f(new a08.n(this, 5), new a(this, 2), new a08.n(this, 6), new a(this, 3), new b(this, 0), null, null, null, BERTags.FLAGS);
    }
}
