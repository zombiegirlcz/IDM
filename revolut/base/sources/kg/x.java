package kg;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f183892a;

    public x(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f183892a = bool;
    }

    public static boolean k(x xVar) {
        Serializable serializable = xVar.f183892a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // kg.u
    public final byte a() {
        return this.f183892a instanceof Number ? j().byteValue() : Byte.parseByte(f());
    }

    @Override // kg.u
    public final long e() {
        return this.f183892a instanceof Number ? j().longValue() : Long.parseLong(f());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || x.class != obj2.getClass()) {
            return false;
        }
        x xVar = (x) obj2;
        Serializable serializable = xVar.f183892a;
        Serializable serializable2 = this.f183892a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (k(this) && k(xVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? g().equals(xVar.g()) : j().longValue() == xVar.j().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : com.google.gson.internal.j.n(f())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.j.n(xVar.f())) == 0;
        }
        double dI = i();
        double dI2 = xVar.i();
        if (dI != dI2) {
            return Double.isNaN(dI) && Double.isNaN(dI2);
        }
        return true;
    }

    @Override // kg.u
    public final String f() {
        Serializable serializable = this.f183892a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return j().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger g() {
        Serializable serializable = this.f183892a;
        return serializable instanceof BigInteger ? (BigInteger) serializable : k(this) ? BigInteger.valueOf(j().longValue()) : com.google.gson.internal.j.o(f());
    }

    public final boolean h() {
        Serializable serializable = this.f183892a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(f());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f183892a;
        if (serializable == null) {
            return 31;
        }
        if (k(this)) {
            jDoubleToLongBits = j().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(j().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final double i() {
        return this.f183892a instanceof Number ? j().doubleValue() : Double.parseDouble(f());
    }

    public final Number j() {
        Serializable serializable = this.f183892a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.l((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public x(Number number) {
        Objects.requireNonNull(number);
        this.f183892a = number;
    }

    public x(String str) {
        Objects.requireNonNull(str);
        this.f183892a = str;
    }
}
