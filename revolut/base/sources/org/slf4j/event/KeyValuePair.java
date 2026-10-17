package org.slf4j.event;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class KeyValuePair {
    public final String key;
    public final Object value;

    public KeyValuePair(String str, Object obj2) {
        this.key = str;
        this.value = obj2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            KeyValuePair keyValuePair = (KeyValuePair) obj2;
            if (Objects.equals(this.key, keyValuePair.key) && Objects.equals(this.value, keyValuePair.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    public String toString() {
        return String.valueOf(this.key) + "=\"" + String.valueOf(this.value) + "\"";
    }
}
