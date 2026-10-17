package nij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f216267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f216268b;

    public k(kdh.b countryPickerMapper, h planItemBuilder) {
        Intrinsics.checkNotNullParameter(countryPickerMapper, "countryPickerMapper");
        Intrinsics.checkNotNullParameter(planItemBuilder, "planItemBuilder");
        this.f216267a = countryPickerMapper;
        this.f216268b = planItemBuilder;
    }
}
