package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {

    @Deprecated
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    public final Uri f7466uri;
    public final long uriPositionOffset;

    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;

        /* JADX INFO: renamed from: uri, reason: collision with root package name */
        private Uri f7467uri;
        private long uriPositionOffset;

        public DataSpec build() {
            Preconditions.checkNotNull(this.f7467uri, "The uri must be set.");
            return new DataSpec(this.f7467uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j2) {
            this.length = j2;
            return this;
        }

        public Builder setPosition(long j2) {
            this.position = j2;
            return this;
        }

        public Builder setUri(String str) {
            this.f7467uri = Uri.parse(str);
            return this;
        }

        public Builder setUriPositionOffset(long j2) {
            this.uriPositionOffset = j2;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.EMPTY_MAP;
            this.length = -1L;
        }

        public Builder setUri(Uri uri2) {
            this.f7467uri = uri2;
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.f7467uri = dataSpec.f7466uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public DataSpec subrange(long j2) {
        long j3 = this.length;
        return subrange(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DataSpec[");
        sb6.append(getHttpMethodString());
        sb6.append(" ");
        sb6.append(this.f7466uri);
        sb6.append(", ");
        sb6.append(this.position);
        sb6.append(", ");
        sb6.append(this.length);
        sb6.append(", ");
        sb6.append(this.key);
        sb6.append(", ");
        return j6.a.v(sb6, "]", this.flags);
    }

    public DataSpec(Uri uri2) {
        this(uri2, 0L, -1L);
    }

    public DataSpec subrange(long j2, long j3) {
        return (j2 == 0 && this.length == j3) ? this : new DataSpec(this.f7466uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j2, j3, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri2, long j2, long j3) {
        this(uri2, j2, j3, null);
    }

    @Deprecated
    public DataSpec(Uri uri2, long j2, long j3, String str) {
        this(uri2, 0L, 1, null, Collections.EMPTY_MAP, j2, j3, str, 0, null);
    }

    private DataSpec(Uri uri2, long j2, int i, byte[] bArr, Map<String, String> map, long j3, long j5, String str, int i2, Object obj2) {
        byte[] bArr2 = bArr;
        long j16 = j2 + j3;
        Preconditions.checkArgument(j16 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 > 0 || j5 == -1);
        this.f7466uri = (Uri) Preconditions.checkNotNull(uri2);
        this.uriPositionOffset = j2;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j3;
        this.absoluteStreamPosition = j16;
        this.length = j5;
        this.key = str;
        this.flags = i2;
        this.customData = obj2;
    }
}
