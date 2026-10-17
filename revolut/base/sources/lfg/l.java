package lfg;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f194905c = new TypeToken<List<? extends yfg.h>>() { // from class: com.revolut.feature.travel.miles.impl.data.repository.TravelMilesLocationRecentSearchRepositoryImpl$Companion$TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f194906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f194907b;

    public l(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f194906a = storage;
        this.f194907b = hlm.d.a();
    }
}
