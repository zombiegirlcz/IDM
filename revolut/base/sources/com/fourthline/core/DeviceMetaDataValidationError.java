package com.fourthline.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/fourthline/core/DeviceMetaDataValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_LOCATION", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceMetaDataValidationError {
    public static final DeviceMetaDataValidationError INVALID_LOCATION = new DeviceMetaDataValidationError("INVALID_LOCATION", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DeviceMetaDataValidationError[] f26242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26243b;

    static {
        DeviceMetaDataValidationError[] deviceMetaDataValidationErrorArrA = a();
        f26242a = deviceMetaDataValidationErrorArrA;
        f26243b = s.n(deviceMetaDataValidationErrorArrA);
    }

    private DeviceMetaDataValidationError(String str, int i) {
    }

    private static final /* synthetic */ DeviceMetaDataValidationError[] a() {
        return new DeviceMetaDataValidationError[]{INVALID_LOCATION};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26243b;
    }

    public static DeviceMetaDataValidationError valueOf(String str) {
        return (DeviceMetaDataValidationError) Enum.valueOf(DeviceMetaDataValidationError.class, str);
    }

    public static DeviceMetaDataValidationError[] values() {
        return (DeviceMetaDataValidationError[]) f26242a.clone();
    }
}
