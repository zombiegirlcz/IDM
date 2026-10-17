package com.google.android.gms.nearby.messages.audio;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public final class AudioBytes {
    public static final int MAX_SIZE = 10;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final byte[] f48058zza;

    public AudioBytes(@NonNull byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        Preconditions.checkArgument(length <= 10, "Given byte array longer than 10 bytes, given by AudioBytes.MAX_SIZE.");
        Preconditions.checkArgument(length > 0, "Given byte array is of zero length.");
        this.f48058zza = bArr;
    }

    @NonNull
    public static AudioBytes from(@NonNull Message message) {
        Preconditions.checkNotNull(message);
        Preconditions.checkArgument(message.zza("__audio_bytes"), "Message type '" + message.getType() + "' is not Message.MESSAGE_TYPE_AUDIO_BYTES.");
        return new AudioBytes(message.getContent());
    }

    @NonNull
    public byte[] getBytes() {
        return this.f48058zza;
    }

    @NonNull
    public Message toMessage() {
        return new Message(this.f48058zza, "__reserved_namespace", "__audio_bytes");
    }

    @NonNull
    public String toString() {
        return a.p("AudioBytes [", Arrays.toString(this.f48058zza), " ]");
    }
}
