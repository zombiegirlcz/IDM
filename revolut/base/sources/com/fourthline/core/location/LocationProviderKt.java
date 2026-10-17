package com.fourthline.core.location;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\b\"\u00020\u00062\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/fourthline/core/location/Coordinate;", "a", "Lcom/fourthline/core/location/Coordinate;", "getNotProvidedCoordinate", "()Lcom/fourthline/core/location/Coordinate;", "notProvidedCoordinate", "", "Latitude", "Longitude", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LocationProviderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Coordinate f26424a = new Coordinate(1000.0d, 1000.0d);

    @NotNull
    public static final Coordinate getNotProvidedCoordinate() {
        return f26424a;
    }
}
