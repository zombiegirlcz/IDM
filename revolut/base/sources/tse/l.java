package tse;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ose.e f274117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef3.b f274118b;

    public l(ose.e ticketsUiMapper, ef3.b ticketsFeatureToggles) {
        Intrinsics.checkNotNullParameter(ticketsUiMapper, "ticketsUiMapper");
        Intrinsics.checkNotNullParameter(ticketsFeatureToggles, "ticketsFeatureToggles");
        this.f274117a = ticketsUiMapper;
        this.f274118b = ticketsFeatureToggles;
    }

    public final List a(Data state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return (List) iii.c.f(state, new j(this, 0), new tq0.j(13), new tch.c(this, 8));
    }
}
