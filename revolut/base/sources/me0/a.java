package me0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f204590a;

    public a(Json baseJson) {
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        this.f204590a = baseJson;
    }

    public final fl0.a a(Json json) {
        if (json == null) {
            json = this.f204590a;
        }
        return new fl0.a(json);
    }
}
