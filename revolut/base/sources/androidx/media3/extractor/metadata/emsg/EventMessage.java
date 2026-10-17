package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class EventMessage implements Metadata.Entry {
    private static final Format ID3_FORMAT = new Format.Builder().setSampleMimeType("application/id3").build();
    private static final Format SCTE35_FORMAT = new Format.Builder().setSampleMimeType("application/x-scte35").build();
    public final long durationMs;
    private int hashCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final long f7621id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j2;
        this.f7621id = j3;
        this.messageData = bArr;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && EventMessage.class == obj2.getClass()) {
            EventMessage eventMessage = (EventMessage) obj2;
            if (this.durationMs == eventMessage.durationMs && this.f7621id == eventMessage.f7621id && Objects.equals(this.schemeIdUri, eventMessage.schemeIdUri) && Objects.equals(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public Format getWrappedMetadataFormat() {
        String str = this.schemeIdUri;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.durationMs;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f7621id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.f7621id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }
}
