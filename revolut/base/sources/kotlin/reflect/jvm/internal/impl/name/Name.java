package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187469b;

    public Name(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f187468a = str;
        this.f187469b = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static Name guessByFirstCharacter(@NotNull String str) {
        if (str != null) {
            return str.startsWith("<") ? special(str) : identifier(str);
        }
        a(9);
        throw null;
    }

    @NotNull
    public static Name identifier(@NotNull String str) {
        if (str != null) {
            return new Name(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean isValidIdentifier(@NotNull String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static Name special(@NotNull String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @NotNull
    public String asString() {
        String str = this.f187468a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Name)) {
            return false;
        }
        Name name = (Name) obj2;
        return this.f187469b == name.f187469b && this.f187468a.equals(name.f187468a);
    }

    @NotNull
    public String getIdentifier() {
        if (this.f187469b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strAsString = asString();
        if (strAsString != null) {
            return strAsString;
        }
        a(2);
        throw null;
    }

    public int hashCode() {
        return (this.f187468a.hashCode() * 31) + (this.f187469b ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.f187469b;
    }

    public String toString() {
        return this.f187468a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.f187468a.compareTo(name.f187468a);
    }
}
