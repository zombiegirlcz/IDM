package jm8;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException;
import com.revolut.feature.junior_rewards.impl.data.service.JuniorRewardsService;
import ghl.l;
import j40.d;
import jch.p;
import jlh.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import sf0.h;
import ue0.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorRewardsService f176489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f176490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f176491c;
    public final h d;
    public final x4l.c e;

    public b(JuniorRewardsService service, j cache, c storage, h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f176489a = service;
        this.f176490b = cache;
        this.f176491c = storage;
        this.d = serverErrorParser;
        Continuation continuation = null;
        this.e = new x4l.c(new l(this, continuation, 22), new g(this, 2), new p(this, 26), new jij.h(this, continuation, 10), new d(this, continuation, 6));
    }

    public static final void a(b bVar, Response response) {
        bVar.getClass();
        if (response.isSuccessful()) {
            return;
        }
        if (response.code() != 422) {
            throw new HttpException(response);
        }
        HttpException httpException = new HttpException(response);
        ServerError serverErrorC = bVar.d.c(httpException);
        if (serverErrorC != null && serverErrorC.f51362a == 20052) {
            throw new JuniorDeviceNotFoundException();
        }
        throw httpException;
    }

    public static String b(String str) {
        return j6.a.q("ELIGIBILITY_PREFIX_", str);
    }
}
