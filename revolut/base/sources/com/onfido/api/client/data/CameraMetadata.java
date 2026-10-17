package com.onfido.api.client.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.e0;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003)*+B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, d2 = {"Lcom/onfido/api/client/data/CameraMetadata;", "", "seen1", "", "totalCameraCount", "frontCamera", "Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "backCamera", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;)V", "getBackCamera$annotations", "()V", "getBackCamera", "()Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "getFrontCamera$annotations", "getFrontCamera", "getTotalCameraCount$annotations", "getTotalCameraCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;)Lcom/onfido/api/client/data/CameraMetadata;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "CameraInfo", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class CameraMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final CameraInfo backCamera;
    private final CameraInfo frontCamera;
    private final Integer totalCameraCount;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 k2\u00020\u0001:\u0002jkB\u008f\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cB×\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001dJ\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010:J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010:J\u0084\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\n2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020\u0003HÖ\u0001J\t\u0010a\u001a\u00020\u0005HÖ\u0001J&\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hHÁ\u0001¢\u0006\u0002\biR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010/R \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010(R \u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b3\u0010\u001f\u001a\u0004\b\u0019\u0010(R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010/R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010/R \u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010;\u0012\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!R$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u001f\u001a\u0004\b?\u0010!R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010/R \u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010;\u0012\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010:R \u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010;\u0012\u0004\bD\u0010\u001f\u001a\u0004\bE\u0010:R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\bF\u0010\u001f\u001a\u0004\bG\u0010/R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00100\u0012\u0004\bH\u0010\u001f\u001a\u0004\bI\u0010/¨\u0006l"}, d2 = {"Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "", "seen1", "", "cameraId", "", "hardwareLevel", "availableCapabilities", "", "backwardCompatible", "", "lensFacing", "availableFocalLengths", "", "minimumFocusDistance", "opticalStabilisationModes", "sensorPhysicalWidth", "sensorPhysicalHeight", "sensorPixelArrayWidth", "sensorPixelArrayHeight", "sensorOrientation", "maxAnalogSensitivity", "aeFpsRanges", "noiseReductionModes", "hasFlashUnit", "isExternalCamera", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAeFpsRanges$annotations", "()V", "getAeFpsRanges", "()Ljava/util/List;", "getAvailableCapabilities$annotations", "getAvailableCapabilities", "getAvailableFocalLengths$annotations", "getAvailableFocalLengths", "getBackwardCompatible$annotations", "getBackwardCompatible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCameraId$annotations", "getCameraId", "()Ljava/lang/String;", "getHardwareLevel$annotations", "getHardwareLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasFlashUnit$annotations", "getHasFlashUnit", "isExternalCamera$annotations", "getLensFacing$annotations", "getLensFacing", "getMaxAnalogSensitivity$annotations", "getMaxAnalogSensitivity", "getMinimumFocusDistance$annotations", "getMinimumFocusDistance", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getNoiseReductionModes$annotations", "getNoiseReductionModes", "getOpticalStabilisationModes$annotations", "getOpticalStabilisationModes", "getSensorOrientation$annotations", "getSensorOrientation", "getSensorPhysicalHeight$annotations", "getSensorPhysicalHeight", "getSensorPhysicalWidth$annotations", "getSensorPhysicalWidth", "getSensorPixelArrayHeight$annotations", "getSensorPixelArrayHeight", "getSensorPixelArrayWidth$annotations", "getSensorPixelArrayWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class CameraInfo {

        @NotNull
        private static final KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final List<Integer> aeFpsRanges;
        private final List<Integer> availableCapabilities;
        private final List<Float> availableFocalLengths;
        private final Boolean backwardCompatible;
        private final String cameraId;
        private final Integer hardwareLevel;
        private final Boolean hasFlashUnit;
        private final Boolean isExternalCamera;
        private final Integer lensFacing;
        private final Integer maxAnalogSensitivity;
        private final Float minimumFocusDistance;
        private final List<Integer> noiseReductionModes;
        private final List<Integer> opticalStabilisationModes;
        private final Integer sensorOrientation;
        private final Float sensorPhysicalHeight;
        private final Float sensorPhysicalWidth;
        private final Integer sensorPixelArrayHeight;
        private final Integer sensorPixelArrayWidth;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/CameraMetadata$CameraInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CameraMetadata$CameraInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            n0 n0Var = n0.f247680a;
            $childSerializers = new KSerializer[]{null, null, new e(n0Var), null, null, new e(e0.f247634a), null, new e(n0Var), null, null, null, null, null, null, new e(n0Var), new e(n0Var), null, null};
        }

        @d
        public /* synthetic */ CameraInfo(int i, String str, Integer num, List list, Boolean bool, Integer num2, List list2, Float f, List list3, Float f4, Float f5, Integer num3, Integer num4, Integer num5, Integer num6, List list4, List list5, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
            if (262143 != (i & 262143)) {
                j1.f(CameraMetadata$CameraInfo$$serializer.INSTANCE.getDescriptor(), i, 262143);
                throw null;
            }
            this.cameraId = str;
            this.hardwareLevel = num;
            this.availableCapabilities = list;
            this.backwardCompatible = bool;
            this.lensFacing = num2;
            this.availableFocalLengths = list2;
            this.minimumFocusDistance = f;
            this.opticalStabilisationModes = list3;
            this.sensorPhysicalWidth = f4;
            this.sensorPhysicalHeight = f5;
            this.sensorPixelArrayWidth = num3;
            this.sensorPixelArrayHeight = num4;
            this.sensorOrientation = num5;
            this.maxAnalogSensitivity = num6;
            this.aeFpsRanges = list4;
            this.noiseReductionModes = list5;
            this.hasFlashUnit = bool2;
            this.isExternalCamera = bool3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CameraInfo copy$default(CameraInfo cameraInfo, String str, Integer num, List list, Boolean bool, Integer num2, List list2, Float f, List list3, Float f4, Float f5, Integer num3, Integer num4, Integer num5, Integer num6, List list4, List list5, Boolean bool2, Boolean bool3, int i, Object obj2) {
            Boolean bool4;
            Boolean bool5;
            String str2 = (i & 1) != 0 ? cameraInfo.cameraId : str;
            Integer num7 = (i & 2) != 0 ? cameraInfo.hardwareLevel : num;
            List list6 = (i & 4) != 0 ? cameraInfo.availableCapabilities : list;
            Boolean bool6 = (i & 8) != 0 ? cameraInfo.backwardCompatible : bool;
            Integer num8 = (i & 16) != 0 ? cameraInfo.lensFacing : num2;
            List list7 = (i & 32) != 0 ? cameraInfo.availableFocalLengths : list2;
            Float f6 = (i & 64) != 0 ? cameraInfo.minimumFocusDistance : f;
            List list8 = (i & 128) != 0 ? cameraInfo.opticalStabilisationModes : list3;
            Float f32 = (i & 256) != 0 ? cameraInfo.sensorPhysicalWidth : f4;
            Float f35 = (i & 512) != 0 ? cameraInfo.sensorPhysicalHeight : f5;
            Integer num9 = (i & 1024) != 0 ? cameraInfo.sensorPixelArrayWidth : num3;
            Integer num10 = (i & 2048) != 0 ? cameraInfo.sensorPixelArrayHeight : num4;
            Integer num11 = (i & 4096) != 0 ? cameraInfo.sensorOrientation : num5;
            Integer num12 = (i & 8192) != 0 ? cameraInfo.maxAnalogSensitivity : num6;
            String str3 = str2;
            List list9 = (i & 16384) != 0 ? cameraInfo.aeFpsRanges : list4;
            List list10 = (i & 32768) != 0 ? cameraInfo.noiseReductionModes : list5;
            Boolean bool7 = (i & 65536) != 0 ? cameraInfo.hasFlashUnit : bool2;
            if ((i & 131072) != 0) {
                bool5 = bool7;
                bool4 = cameraInfo.isExternalCamera;
            } else {
                bool4 = bool3;
                bool5 = bool7;
            }
            return cameraInfo.copy(str3, num7, list6, bool6, num8, list7, f6, list8, f32, f35, num9, num10, num11, num12, list9, list10, bool5, bool4);
        }

        public static /* synthetic */ void getAeFpsRanges$annotations() {
        }

        public static /* synthetic */ void getAvailableCapabilities$annotations() {
        }

        public static /* synthetic */ void getAvailableFocalLengths$annotations() {
        }

        public static /* synthetic */ void getBackwardCompatible$annotations() {
        }

        public static /* synthetic */ void getCameraId$annotations() {
        }

        public static /* synthetic */ void getHardwareLevel$annotations() {
        }

        public static /* synthetic */ void getHasFlashUnit$annotations() {
        }

        public static /* synthetic */ void getLensFacing$annotations() {
        }

        public static /* synthetic */ void getMaxAnalogSensitivity$annotations() {
        }

        public static /* synthetic */ void getMinimumFocusDistance$annotations() {
        }

        public static /* synthetic */ void getNoiseReductionModes$annotations() {
        }

        public static /* synthetic */ void getOpticalStabilisationModes$annotations() {
        }

        public static /* synthetic */ void getSensorOrientation$annotations() {
        }

        public static /* synthetic */ void getSensorPhysicalHeight$annotations() {
        }

        public static /* synthetic */ void getSensorPhysicalWidth$annotations() {
        }

        public static /* synthetic */ void getSensorPixelArrayHeight$annotations() {
        }

        public static /* synthetic */ void getSensorPixelArrayWidth$annotations() {
        }

        public static /* synthetic */ void isExternalCamera$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(CameraInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            output.encodeNullableSerializableElement(serialDesc, 0, v1.f247718a, self.cameraId);
            n0 n0Var = n0.f247680a;
            output.encodeNullableSerializableElement(serialDesc, 1, n0Var, self.hardwareLevel);
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.availableCapabilities);
            h hVar = h.f247648a;
            output.encodeNullableSerializableElement(serialDesc, 3, hVar, self.backwardCompatible);
            output.encodeNullableSerializableElement(serialDesc, 4, n0Var, self.lensFacing);
            output.encodeNullableSerializableElement(serialDesc, 5, kSerializerArr[5], self.availableFocalLengths);
            e0 e0Var = e0.f247634a;
            output.encodeNullableSerializableElement(serialDesc, 6, e0Var, self.minimumFocusDistance);
            output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], self.opticalStabilisationModes);
            output.encodeNullableSerializableElement(serialDesc, 8, e0Var, self.sensorPhysicalWidth);
            output.encodeNullableSerializableElement(serialDesc, 9, e0Var, self.sensorPhysicalHeight);
            output.encodeNullableSerializableElement(serialDesc, 10, n0Var, self.sensorPixelArrayWidth);
            output.encodeNullableSerializableElement(serialDesc, 11, n0Var, self.sensorPixelArrayHeight);
            output.encodeNullableSerializableElement(serialDesc, 12, n0Var, self.sensorOrientation);
            output.encodeNullableSerializableElement(serialDesc, 13, n0Var, self.maxAnalogSensitivity);
            output.encodeNullableSerializableElement(serialDesc, 14, kSerializerArr[14], self.aeFpsRanges);
            output.encodeNullableSerializableElement(serialDesc, 15, kSerializerArr[15], self.noiseReductionModes);
            output.encodeNullableSerializableElement(serialDesc, 16, hVar, self.hasFlashUnit);
            output.encodeNullableSerializableElement(serialDesc, 17, hVar, self.isExternalCamera);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCameraId() {
            return this.cameraId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Float getSensorPhysicalHeight() {
            return this.sensorPhysicalHeight;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Integer getSensorPixelArrayWidth() {
            return this.sensorPixelArrayWidth;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getSensorPixelArrayHeight() {
            return this.sensorPixelArrayHeight;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getSensorOrientation() {
            return this.sensorOrientation;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Integer getMaxAnalogSensitivity() {
            return this.maxAnalogSensitivity;
        }

        public final List<Integer> component15() {
            return this.aeFpsRanges;
        }

        public final List<Integer> component16() {
            return this.noiseReductionModes;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Boolean getHasFlashUnit() {
            return this.hasFlashUnit;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Boolean getIsExternalCamera() {
            return this.isExternalCamera;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHardwareLevel() {
            return this.hardwareLevel;
        }

        public final List<Integer> component3() {
            return this.availableCapabilities;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getBackwardCompatible() {
            return this.backwardCompatible;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getLensFacing() {
            return this.lensFacing;
        }

        public final List<Float> component6() {
            return this.availableFocalLengths;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Float getMinimumFocusDistance() {
            return this.minimumFocusDistance;
        }

        public final List<Integer> component8() {
            return this.opticalStabilisationModes;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Float getSensorPhysicalWidth() {
            return this.sensorPhysicalWidth;
        }

        @NotNull
        public final CameraInfo copy(String cameraId, Integer hardwareLevel, List<Integer> availableCapabilities, Boolean backwardCompatible, Integer lensFacing, List<Float> availableFocalLengths, Float minimumFocusDistance, List<Integer> opticalStabilisationModes, Float sensorPhysicalWidth, Float sensorPhysicalHeight, Integer sensorPixelArrayWidth, Integer sensorPixelArrayHeight, Integer sensorOrientation, Integer maxAnalogSensitivity, List<Integer> aeFpsRanges, List<Integer> noiseReductionModes, Boolean hasFlashUnit, Boolean isExternalCamera) {
            return new CameraInfo(cameraId, hardwareLevel, availableCapabilities, backwardCompatible, lensFacing, availableFocalLengths, minimumFocusDistance, opticalStabilisationModes, sensorPhysicalWidth, sensorPhysicalHeight, sensorPixelArrayWidth, sensorPixelArrayHeight, sensorOrientation, maxAnalogSensitivity, aeFpsRanges, noiseReductionModes, hasFlashUnit, isExternalCamera);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraInfo)) {
                return false;
            }
            CameraInfo cameraInfo = (CameraInfo) other;
            return Intrinsics.f(this.cameraId, cameraInfo.cameraId) && Intrinsics.f(this.hardwareLevel, cameraInfo.hardwareLevel) && Intrinsics.f(this.availableCapabilities, cameraInfo.availableCapabilities) && Intrinsics.f(this.backwardCompatible, cameraInfo.backwardCompatible) && Intrinsics.f(this.lensFacing, cameraInfo.lensFacing) && Intrinsics.f(this.availableFocalLengths, cameraInfo.availableFocalLengths) && Intrinsics.f(this.minimumFocusDistance, cameraInfo.minimumFocusDistance) && Intrinsics.f(this.opticalStabilisationModes, cameraInfo.opticalStabilisationModes) && Intrinsics.f(this.sensorPhysicalWidth, cameraInfo.sensorPhysicalWidth) && Intrinsics.f(this.sensorPhysicalHeight, cameraInfo.sensorPhysicalHeight) && Intrinsics.f(this.sensorPixelArrayWidth, cameraInfo.sensorPixelArrayWidth) && Intrinsics.f(this.sensorPixelArrayHeight, cameraInfo.sensorPixelArrayHeight) && Intrinsics.f(this.sensorOrientation, cameraInfo.sensorOrientation) && Intrinsics.f(this.maxAnalogSensitivity, cameraInfo.maxAnalogSensitivity) && Intrinsics.f(this.aeFpsRanges, cameraInfo.aeFpsRanges) && Intrinsics.f(this.noiseReductionModes, cameraInfo.noiseReductionModes) && Intrinsics.f(this.hasFlashUnit, cameraInfo.hasFlashUnit) && Intrinsics.f(this.isExternalCamera, cameraInfo.isExternalCamera);
        }

        public final List<Integer> getAeFpsRanges() {
            return this.aeFpsRanges;
        }

        public final List<Integer> getAvailableCapabilities() {
            return this.availableCapabilities;
        }

        public final List<Float> getAvailableFocalLengths() {
            return this.availableFocalLengths;
        }

        public final Boolean getBackwardCompatible() {
            return this.backwardCompatible;
        }

        public final String getCameraId() {
            return this.cameraId;
        }

        public final Integer getHardwareLevel() {
            return this.hardwareLevel;
        }

        public final Boolean getHasFlashUnit() {
            return this.hasFlashUnit;
        }

        public final Integer getLensFacing() {
            return this.lensFacing;
        }

        public final Integer getMaxAnalogSensitivity() {
            return this.maxAnalogSensitivity;
        }

        public final Float getMinimumFocusDistance() {
            return this.minimumFocusDistance;
        }

        public final List<Integer> getNoiseReductionModes() {
            return this.noiseReductionModes;
        }

        public final List<Integer> getOpticalStabilisationModes() {
            return this.opticalStabilisationModes;
        }

        public final Integer getSensorOrientation() {
            return this.sensorOrientation;
        }

        public final Float getSensorPhysicalHeight() {
            return this.sensorPhysicalHeight;
        }

        public final Float getSensorPhysicalWidth() {
            return this.sensorPhysicalWidth;
        }

        public final Integer getSensorPixelArrayHeight() {
            return this.sensorPixelArrayHeight;
        }

        public final Integer getSensorPixelArrayWidth() {
            return this.sensorPixelArrayWidth;
        }

        public int hashCode() {
            String str = this.cameraId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.hardwareLevel;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<Integer> list = this.availableCapabilities;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.backwardCompatible;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.lensFacing;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<Float> list2 = this.availableFocalLengths;
            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Float f = this.minimumFocusDistance;
            int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            List<Integer> list3 = this.opticalStabilisationModes;
            int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Float f4 = this.sensorPhysicalWidth;
            int iHashCode9 = (iHashCode8 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Float f5 = this.sensorPhysicalHeight;
            int iHashCode10 = (iHashCode9 + (f5 == null ? 0 : f5.hashCode())) * 31;
            Integer num3 = this.sensorPixelArrayWidth;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.sensorPixelArrayHeight;
            int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.sensorOrientation;
            int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.maxAnalogSensitivity;
            int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<Integer> list4 = this.aeFpsRanges;
            int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<Integer> list5 = this.noiseReductionModes;
            int iHashCode16 = (iHashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool2 = this.hasFlashUnit;
            int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isExternalCamera;
            return iHashCode17 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final Boolean isExternalCamera() {
            return this.isExternalCamera;
        }

        @NotNull
        public String toString() {
            return "CameraInfo(cameraId=" + this.cameraId + ", hardwareLevel=" + this.hardwareLevel + ", availableCapabilities=" + this.availableCapabilities + ", backwardCompatible=" + this.backwardCompatible + ", lensFacing=" + this.lensFacing + ", availableFocalLengths=" + this.availableFocalLengths + ", minimumFocusDistance=" + this.minimumFocusDistance + ", opticalStabilisationModes=" + this.opticalStabilisationModes + ", sensorPhysicalWidth=" + this.sensorPhysicalWidth + ", sensorPhysicalHeight=" + this.sensorPhysicalHeight + ", sensorPixelArrayWidth=" + this.sensorPixelArrayWidth + ", sensorPixelArrayHeight=" + this.sensorPixelArrayHeight + ", sensorOrientation=" + this.sensorOrientation + ", maxAnalogSensitivity=" + this.maxAnalogSensitivity + ", aeFpsRanges=" + this.aeFpsRanges + ", noiseReductionModes=" + this.noiseReductionModes + ", hasFlashUnit=" + this.hasFlashUnit + ", isExternalCamera=" + this.isExternalCamera + ")";
        }

        public CameraInfo(String str, Integer num, List<Integer> list, Boolean bool, Integer num2, List<Float> list2, Float f, List<Integer> list3, Float f4, Float f5, Integer num3, Integer num4, Integer num5, Integer num6, List<Integer> list4, List<Integer> list5, Boolean bool2, Boolean bool3) {
            this.cameraId = str;
            this.hardwareLevel = num;
            this.availableCapabilities = list;
            this.backwardCompatible = bool;
            this.lensFacing = num2;
            this.availableFocalLengths = list2;
            this.minimumFocusDistance = f;
            this.opticalStabilisationModes = list3;
            this.sensorPhysicalWidth = f4;
            this.sensorPhysicalHeight = f5;
            this.sensorPixelArrayWidth = num3;
            this.sensorPixelArrayHeight = num4;
            this.sensorOrientation = num5;
            this.maxAnalogSensitivity = num6;
            this.aeFpsRanges = list4;
            this.noiseReductionModes = list5;
            this.hasFlashUnit = bool2;
            this.isExternalCamera = bool3;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/CameraMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/CameraMetadata;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CameraMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ CameraMetadata(int i, Integer num, CameraInfo cameraInfo, CameraInfo cameraInfo2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(CameraMetadata$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.totalCameraCount = num;
        this.frontCamera = cameraInfo;
        this.backCamera = cameraInfo2;
    }

    public static /* synthetic */ CameraMetadata copy$default(CameraMetadata cameraMetadata, Integer num, CameraInfo cameraInfo, CameraInfo cameraInfo2, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = cameraMetadata.totalCameraCount;
        }
        if ((i & 2) != 0) {
            cameraInfo = cameraMetadata.frontCamera;
        }
        if ((i & 4) != 0) {
            cameraInfo2 = cameraMetadata.backCamera;
        }
        return cameraMetadata.copy(num, cameraInfo, cameraInfo2);
    }

    public static /* synthetic */ void getBackCamera$annotations() {
    }

    public static /* synthetic */ void getFrontCamera$annotations() {
    }

    public static /* synthetic */ void getTotalCameraCount$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(CameraMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, n0.f247680a, self.totalCameraCount);
        CameraMetadata$CameraInfo$$serializer cameraMetadata$CameraInfo$$serializer = CameraMetadata$CameraInfo$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, cameraMetadata$CameraInfo$$serializer, self.frontCamera);
        output.encodeNullableSerializableElement(serialDesc, 2, cameraMetadata$CameraInfo$$serializer, self.backCamera);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTotalCameraCount() {
        return this.totalCameraCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CameraInfo getFrontCamera() {
        return this.frontCamera;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CameraInfo getBackCamera() {
        return this.backCamera;
    }

    @NotNull
    public final CameraMetadata copy(Integer totalCameraCount, CameraInfo frontCamera, CameraInfo backCamera) {
        return new CameraMetadata(totalCameraCount, frontCamera, backCamera);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraMetadata)) {
            return false;
        }
        CameraMetadata cameraMetadata = (CameraMetadata) other;
        return Intrinsics.f(this.totalCameraCount, cameraMetadata.totalCameraCount) && Intrinsics.f(this.frontCamera, cameraMetadata.frontCamera) && Intrinsics.f(this.backCamera, cameraMetadata.backCamera);
    }

    public final CameraInfo getBackCamera() {
        return this.backCamera;
    }

    public final CameraInfo getFrontCamera() {
        return this.frontCamera;
    }

    public final Integer getTotalCameraCount() {
        return this.totalCameraCount;
    }

    public int hashCode() {
        Integer num = this.totalCameraCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CameraInfo cameraInfo = this.frontCamera;
        int iHashCode2 = (iHashCode + (cameraInfo == null ? 0 : cameraInfo.hashCode())) * 31;
        CameraInfo cameraInfo2 = this.backCamera;
        return iHashCode2 + (cameraInfo2 != null ? cameraInfo2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CameraMetadata(totalCameraCount=" + this.totalCameraCount + ", frontCamera=" + this.frontCamera + ", backCamera=" + this.backCamera + ")";
    }

    public CameraMetadata(Integer num, CameraInfo cameraInfo, CameraInfo cameraInfo2) {
        this.totalCameraCount = num;
        this.frontCamera = cameraInfo;
        this.backCamera = cameraInfo2;
    }
}
