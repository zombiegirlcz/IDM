package v20;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public final String a(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        new StringBuilder("?force=").append(UUID.randomUUID());
        return "https://chat.revolut.com/api/client/uploads/" + uuid + "/thumb";
    }
}
